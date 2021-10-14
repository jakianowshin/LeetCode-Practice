import java.util.ArrayList;
import java.util.Arrays;

 class RemoveDuplicateStrings {
    public static void main(String[] args) {

        String[] strColors = {
                "red",
                "blue",
                "green",
                "red",
                "yellow",
                "green"
        };

        System.out.println("Original array: "
                + Arrays.toString(strColors));


    ArrayList<String> aListColors = new ArrayList<String>();


    for(int i=0; i < strColors.length; i++){

        if( !aListColors.contains(strColors[i]) ){
            aListColors.add(strColors[i]);
        }
    }


    strColors = aListColors.toArray( new String[aListColors.size()] );

    System.out.println("Array after removing duplicates: "
        + Arrays.toString(strColors));
    }
}
