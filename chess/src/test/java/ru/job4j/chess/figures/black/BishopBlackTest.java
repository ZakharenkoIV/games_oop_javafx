package ru.job4j.chess.figures.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {
    @Test
    public void whenFigureHasSamePositionAsWhenCreationThenTestSuccess() {
        Figure bishopBlack = new BishopBlack(Cell.D3);
        assertThat(Cell.D3, is(bishopBlack.position()));
    }

    @Test
    public void whenCopyHasPositionCopiedObjectThenTestSuccess() {
        Figure bishopBlack = new BishopBlack(Cell.F2);
        Figure copyBishopBlack = bishopBlack.copy(Cell.A7);
        assertThat(Cell.A7, is(copyBishopBlack.position()));
    }

    @Test
    public void whenDiagonalIsTransmittedThenGotAnArraySteps() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] steps = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(steps, is(bishopBlack.way(Cell.C1, Cell.G5)));
    }

    @Test(expected = IllegalStateException.class)
    public void whenNotDiagonalIsTransmittedThenGetException() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.C1, Cell.C5);
    }
}
