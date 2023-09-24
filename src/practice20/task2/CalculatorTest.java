package practice20.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.event.ActionEvent;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private CalculatorModel model;
    private CalculatorController controller;

    @BeforeEach
    public void setUp() {
        model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        controller = new CalculatorController(model, view);
        view.setController(controller);
    }

    @Test
    public void testAddition() {
        controller.actionPerformed(new ActionEvent(controller, ActionEvent.ACTION_PERFORMED, "5"));
        controller.actionPerformed(new ActionEvent(controller, ActionEvent.ACTION_PERFORMED, "3"));
        controller.actionPerformed(new ActionEvent(controller, ActionEvent.ACTION_PERFORMED, "+"));
        controller.actionPerformed(new ActionEvent(controller, ActionEvent.ACTION_PERFORMED, "="));

        assertEquals(8.0, model.getResult());
    }

    @Test
    public void testSubtraction() {
        controller.actionPerformed(new ActionEvent(controller, ActionEvent.ACTION_PERFORMED, "8"));
        controller.actionPerformed(new ActionEvent(controller, ActionEvent.ACTION_PERFORMED, "3"));
        controller.actionPerformed(new ActionEvent(controller, ActionEvent.ACTION_PERFORMED, "-"));
        controller.actionPerformed(new ActionEvent(controller, ActionEvent.ACTION_PERFORMED, "="));

        assertEquals(5.0, model.getResult());
    }

    @Test
    public void testMultiplication() {
        controller.actionPerformed(new ActionEvent(controller, ActionEvent.ACTION_PERFORMED, "4"));
        controller.actionPerformed(new ActionEvent(controller, ActionEvent.ACTION_PERFORMED, "3"));
        controller.actionPerformed(new ActionEvent(controller, ActionEvent.ACTION_PERFORMED, "*"));
        controller.actionPerformed(new ActionEvent(controller, ActionEvent.ACTION_PERFORMED, "="));

        assertEquals(12.0, model.getResult());
    }

    @Test
    public void testDivision() {
        controller.actionPerformed(new ActionEvent(controller, ActionEvent.ACTION_PERFORMED, "8"));
        controller.actionPerformed(new ActionEvent(controller, ActionEvent.ACTION_PERFORMED, "2"));
        controller.actionPerformed(new ActionEvent(controller, ActionEvent.ACTION_PERFORMED, "/"));
        controller.actionPerformed(new ActionEvent(controller, ActionEvent.ACTION_PERFORMED, "="));

        assertEquals(4.0, model.getResult());
    }

    @Test
    public void testInvalidExpression() {
        controller.actionPerformed(new ActionEvent(controller, ActionEvent.ACTION_PERFORMED, "5"));
        controller.actionPerformed(new ActionEvent(controller, ActionEvent.ACTION_PERFORMED, "+"));
        controller.actionPerformed(new ActionEvent(controller, ActionEvent.ACTION_PERFORMED, "="));

        // Ожидаемая ошибка: "Error" и результат NaN (невозможно вычислить)
        assertEquals("Error", model.getResult());
        assertTrue(Double.isNaN(model.getResult()));
    }
}
