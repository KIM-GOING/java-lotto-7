package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputBonus {

    // 보너스 번호 입력
    public int getBonus() {
        while(true) {
            try {
                System.out.println("Please enter a bonus numbers.");
                String strBonus = Console.readLine();
                int bonus = checkBonus(strBonus);
                return bonus;
            }

            catch (NumberFormatException e) {
                System.out.println("[ERROR] It is not a number.");
            }

            // 숫자 범위를 벗어나는 입력
            catch (IllegalArgumentException e) {
                System.out.println("[ERROR] It is out of range.");
            }
        }
    }

    // 올바른 입력 체크 합수
    public int checkBonus(String strBonus) {

        // 숫자인지 체크
        int bonus = Integer.parseInt(strBonus);

        // 숫자 범위 확인
        if(bonus < 1 || bonus > 45) {
            throw new IllegalArgumentException();
        }

        return bonus;
    }
}
