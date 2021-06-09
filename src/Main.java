import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {

            String [] strings = reader.readLine().split(" ");
            int [] convertedStrings = new int[strings.length];

            for (int i = 0; i < strings.length; i++) {
                convertedStrings[i] = Integer.parseInt(strings[i]);

            }
            try(FileWriter writer = new FileWriter("output.txt")){
                for (int i = 0; i < convertedStrings.length; i++) {
                    if(convertedStrings[i]%2==0 && convertedStrings[i]>0){
                        writer.write(convertedStrings[i]*2+" ");
                    }
                    else if (convertedStrings[i]%2!=0 && convertedStrings[i]>0){
                        writer.write(convertedStrings[i]+1+" ");
                    }
                    else if(convertedStrings[i]<0){
                        writer.write(convertedStrings[i]*-1+" ");
                    }
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
