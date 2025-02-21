package lotto;

import lotto.view.InputMoney;
import lotto.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputMoney money = new InputMoney();
        OutputView output = new OutputView();

        money.getMoney();
        output.showLottoCount();
    }
}
