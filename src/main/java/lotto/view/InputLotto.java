package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;

public class InputLotto {

    // 당첨 번호 입력
    public ArrayList<Integer> getLotto() {
        while(true) { // 예외 발생 시 반복적인 입력을 받기 위한 반복문
            try {
                System.out.println("Please enter a lotto numbers.");
                String strlotto = Console.readLine();
                ArrayList<Integer> lotto = checkLotto(strlotto);
                return lotto;
            }

            // 숫자가 아니거나 구분자가 이상한 입력
            catch (NumberFormatException e) {
                System.out.println("[ERROR] It is not a valid lotto.");
            }

            // 숫자 범위를 벗어나는 입력
            catch (IllegalArgumentException e) {
                System.out.println("[ERROR] It is out of range.");
            }
        }
    }

    // 올바른 입력 체크 함수
    public ArrayList<Integer> checkLotto(String lotto) {
        ArrayList<Integer> arrLotto = new ArrayList<Integer>();

        // 구분자(,)를 기준으로 문자열 자르기
        String[] strLotto = lotto.split(",");

        // 문자를 숫자로 변환
        for (int i = 0; i < strLotto.length; i++) {
            arrLotto.add(Integer.parseInt(strLotto[i]));
        }

        // 숫자 개수 확인
        if (arrLotto.size() != 6) {
            throw new IllegalArgumentException();
        }

        // 숫자 범위 확인
        for (int i = 0; i < arrLotto.size(); i++) {
            if(arrLotto.get(i) < 1 || arrLotto.get(i) > 45) {
                throw new IllegalArgumentException();
            }
        }

        return arrLotto;
    }
}
