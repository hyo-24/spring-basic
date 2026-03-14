package hello.core.autowired;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExampleTest {

    private int name;
    private int num;

    static void main() {
        ExampleTest exampleTest = new ExampleTest();
        exampleTest.setName(12);
        int name1 = exampleTest.getName();
        System.out.println(name1);
    }
}
