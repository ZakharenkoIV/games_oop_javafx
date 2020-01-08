package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LogicTest {

    @Test
    public void whenWayClearThenMovementCompleted() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.A2));
        logic.add(new BishopBlack(Cell.A3));
        logic.add(new BishopBlack(Cell.A4));
        logic.add(new BishopBlack(Cell.A5));
        logic.add(new BishopBlack(Cell.A6));
        logic.add(new BishopBlack(Cell.A7));
        logic.add(new BishopBlack(Cell.A8));
        logic.add(new BishopBlack(Cell.B1));
        logic.add(new BishopBlack(Cell.B2));
        logic.add(new BishopBlack(Cell.B3));
        logic.add(new BishopBlack(Cell.B4));
        logic.add(new BishopBlack(Cell.B5));
        logic.add(new BishopBlack(Cell.B6));
        logic.add(new BishopBlack(Cell.B7));
        logic.add(new BishopBlack(Cell.B8));
        logic.add(new BishopBlack(Cell.H1));
        logic.add(new BishopBlack(Cell.H2));
        logic.add(new BishopBlack(Cell.H3));
        logic.add(new BishopBlack(Cell.H4));
        logic.add(new BishopBlack(Cell.H5));
        logic.add(new BishopBlack(Cell.H6));
        logic.add(new BishopBlack(Cell.H7));
        logic.add(new BishopBlack(Cell.H8));
        logic.add(new BishopBlack(Cell.G1));
        logic.add(new BishopBlack(Cell.G2));
        logic.add(new BishopBlack(Cell.G3));
        logic.add(new BishopBlack(Cell.G4));
        logic.add(new BishopBlack(Cell.G6));
        logic.add(new BishopBlack(Cell.G7));
        logic.add(new BishopBlack(Cell.G8));
        logic.add(new BishopBlack(Cell.C8));

        assertThat(true, is(logic.move(Cell.C1, Cell.G5)));
    }

    @Test
    public void whenObstacleInTheWayThenNoMovement() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.D2));
        logic.add(new BishopBlack(Cell.A3));
        logic.add(new BishopBlack(Cell.A4));
        logic.add(new BishopBlack(Cell.A5));
        logic.add(new BishopBlack(Cell.A6));
        logic.add(new BishopBlack(Cell.A7));
        logic.add(new BishopBlack(Cell.A8));
        logic.add(new BishopBlack(Cell.B1));
        logic.add(new BishopBlack(Cell.C7));
        logic.add(new BishopBlack(Cell.B3));
        logic.add(new BishopBlack(Cell.B4));
        logic.add(new BishopBlack(Cell.B5));
        logic.add(new BishopBlack(Cell.B6));
        logic.add(new BishopBlack(Cell.B7));
        logic.add(new BishopBlack(Cell.B8));
        logic.add(new BishopBlack(Cell.H1));
        logic.add(new BishopBlack(Cell.H2));
        logic.add(new BishopBlack(Cell.H3));
        logic.add(new BishopBlack(Cell.H4));
        logic.add(new BishopBlack(Cell.H5));
        logic.add(new BishopBlack(Cell.H6));
        logic.add(new BishopBlack(Cell.H7));
        logic.add(new BishopBlack(Cell.H8));
        logic.add(new BishopBlack(Cell.G1));
        logic.add(new BishopBlack(Cell.G2));
        logic.add(new BishopBlack(Cell.G3));
        logic.add(new BishopBlack(Cell.G4));
        logic.add(new BishopBlack(Cell.G6));
        logic.add(new BishopBlack(Cell.G7));
        logic.add(new BishopBlack(Cell.G8));
        logic.add(new BishopBlack(Cell.C8));

        assertThat(false, is(logic.move(Cell.C1, Cell.G5)));
    }
}
