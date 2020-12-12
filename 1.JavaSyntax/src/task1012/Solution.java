package task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/* 
Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв
(для 33 маленьких букв алфавита). Результат вывести на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
...
я 9

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < alphabet.size(); i++)
            map.put(alphabet.get(i), 0);

        for (int i = 0; i < 10; i++){
            char[] symbols = list.get(i).toCharArray();
            for (int j = 0; j < symbols.length; j++){
                if ( alphabet.contains(symbols[j]))
                map.put(symbols[j], (map.get(symbols[j])+1));
            }
        }

        for (int i = 0; i < alphabet.size(); i++)
            System.out.println(alphabet.get(i) + " " + map.get(alphabet.get(i)));
    }
}
