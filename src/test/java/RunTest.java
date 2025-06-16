
import org.junit.jupiter.api.Test;

import com.curso.Run;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

class RunTest {

    @Test
    void testMainFullOutput() {
        String simulatedInput = "TestUser\n";
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;

        try {
            System.setIn(in);
            System.setOut(new PrintStream(out));

            Run.main(new String[]{});

            String output = out.toString();

            assertTrue(output.contains("In english: Hello World!"));
            assertTrue(output.contains("In english: By World!"));
            assertTrue(output.contains("En español: Hola Mundo!"));
            assertTrue(output.contains("En español: Adios Mundo!"));
            assertTrue(output.contains("Inserta tu nombre: "));
            assertTrue(output.contains("Hola, TestUser!"));
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }
}