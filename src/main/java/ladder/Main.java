package ladder;

import ladder.domain.Floor;
import ladder.domain.LadderGame;
import ladder.view.InputView;
import ladder.view.OutputView;

public class Main {
    public static void main(String[] args) {
        String inputNames = InputView.inputPlayerNamesMessage();
        Floor inputfloors = InputView.inputFloorsMessage();
        LadderGame ladderGame = new LadderGame(inputfloors, inputNames);
        OutputView.resultTitle();
        OutputView.resultLadder(ladderGame);
    }
}