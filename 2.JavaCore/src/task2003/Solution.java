package task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/*
Знакомство с properties
Метод main() считывает имя файла с консоли и заполняет runtimeStorage данными из файла.
В методах save() и load() реализуй логику записи в файл и чтения из файла для карты runtimeStorage.
Файл должен быть в формате .properties. Комментарии в файле можно игнорировать.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties


Требования:
1. Метод save() должен сохранять карту runtimeStorage в параметр outputStream.
2. Метод load() должен восстанавливать состояние карты runtimeStorage из параметра inputStream.
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        load(new FileInputStream(file));

    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties p = new Properties();
        p.putAll(properties);
        p.store(outputStream, "");
        outputStream.close();
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties p = new Properties();
        p.load(inputStream);
        for (Object key : p.keySet())
            properties.put(key.toString(), p.getProperty(key.toString()));
        inputStream.close();


    }
}
