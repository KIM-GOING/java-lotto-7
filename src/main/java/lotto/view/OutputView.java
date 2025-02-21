package lotto.view;

import lotto.model.LottoCount;

public class OutputView {
    public void showLottoCount() {
        LottoCount lottoCount = new LottoCount();
        System.out.println(lottoCount.setPurchaseLotto() + " purchase lotto.");
    }
}
