import org.junit.*;
import static org.junit.Assert.*;

public class TodolistTest {

  @Test
  public void Todolist_instantiatesCorrectly_true() {
    Todolist myTodolist = new Todolist("Mow the lawn");
    assertEquals(true, myTodolist instanceof Todolist);
  }
  @Test
  public void Todolist_instantiatesWithDescription_true() {
  Todolist myTask = new Todolist("Mow the lawn");
  assertEquals("Mow the lawn", myTask.getDescription());
  }
}
