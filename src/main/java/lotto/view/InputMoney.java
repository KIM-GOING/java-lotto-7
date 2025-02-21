package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputMoney {

    // 로또 구입 금액 입력
    public int getMoney() {
        while(true) { // 예외 발생 시 반복적인 입력을 받기 위한 반복문
            try {
                System.out.println("Please enter a money.");
                int money = Integer.parseInt(Console.readLine());
                checkMoney(money);
                return money;
            }

            // 숫자 이외의 입력
            catch (NumberFormatException e) {
                System.out.println("[ERROR] It is not a number.");
            }

            // 1000원으로 나누어 떨어지지 않는 입력
            catch (IllegalArgumentException e) {
                System.out.println("[ERROR] It is not a valid money.");
            }
        }
    }

    // 1000원으로 나누어 떨어지지 않는 입력 체크 함수
    public int checkMoney(int money) {
        int value = money % 1000;
        if(value != 0) {
            throw new IllegalArgumentException();
        }
        return value;
    }
}
