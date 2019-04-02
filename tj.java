package fangfa.a;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
 
public class jsf {
    // ͳ�����ֻ����ַ����ֵĴ���
    public static TreeMap<Character, Integer> Pross(String str) {
        char[] charArray = str.toCharArray();
 
        TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
 
        for (int x = 0; x < charArray.length; x++) {
            if (!tm.containsKey(charArray[x])) {
                tm.put(charArray[x], 1);
            } else {
                int count = tm.get(charArray[x]) + 1;
                tm.put(charArray[x], count);
            }
        }
        return tm;
    }
 
    public static void main(String[] args) {
        BufferedReader br = null;
        int line = 0;
        String str = "";
        StringBuffer sb  = new StringBuffer();
        try {
            br = new BufferedReader(new FileReader("c:\\1.txt"));
            while ((str = br.readLine()) != null) {
                sb.append(str);
                ++line;
            }
            System.out.println("\n�ļ�����: " + line);
            System.out.println("\n�ļ�����: " + sb.toString());
            TreeMap<Character, Integer> tm = Pross(sb.toString());
            System.out.println("\n�ַ�ͳ�ƽ��Ϊ��" + tm);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}