package test;

import operations.StatementOperation;
import org.junit.Test;
import static org.junit.Assert.*;
public class StatementOperationTest {
    @Test
    public void statementOperation(){
    StatementOperation operationObject=new StatementOperation();
    String input="this is string which is string is this string ";
    String output="is which string this";
    assertEquals(output, operationObject.operationOnStatement(input));
}
}

