import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.List;

public class listClass {

    public List<String> arraylistMethod() {
        List<String> list = new ArrayList<>();

        // 添加元素
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // 访问元素
        System.out.println(list.get(1));  // 输出: Banana

        // 删除元素
        list.remove(1);
        return list;
    }

    public List<String> linkedlistMethod() {
        List<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.add(1, "Orange");
        return list;
    }

    public List<String> vectorMethod() {
        List<String> list = new Vector<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        return list;
    }

    public List<String> stackMethod() {
        Stack<String> stack = new Stack<>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("pop the last item");
        System.out.println(stack.pop());

        return stack;
    }

    public static void main(String[] args) {
        listClass lc = new listClass();

        System.out.println(lc.arraylistMethod());  // 输出: [Apple, Cherry]
        System.out.println(lc.linkedlistMethod()); // 输出: [Apple, Orange, Banana, Cherry]
        System.out.println(lc.vectorMethod());     // 输出: [Apple, Banana, Cherry]
        System.out.println(lc.stackMethod());      // 输出: [Apple, Banana, Cherry]
    }
}
