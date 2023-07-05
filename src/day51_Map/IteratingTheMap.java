package day51_Map;

import java.util.*;

public class IteratingTheMap {

    public static void main(String[] args) {
        /*
              	---------------------------
		keySet()  : returns all the keys of the map, returnType is Set
		values()  : returns all the values of the map, returnType is Collection
		entrySet(): returns all the entries (Entry: key & value) of map
				getkey()
				getValue()
				setValue()
         */
// *** =================== keySet()  : ===================
        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali",85);
        students.put("Alex",80);
        students.put("Ozan",99);
        students.put("Serkan",70);
        students.put("Andriy",98);
/*
        Set<String> keys = students.keySet();
        for (String eachKey : keys) {
         //   System.out.println(eachKey +" : " + students.get(eachKey));
            students.replace(eachKey, students.get(eachKey) + 5);
        }
*/
        System.out.println(students); //{Alex=80, Andriy=98, Aygun=95, Maria=90, Ozan=99, Serkan=70, Ali=85}

        System.out.println("------------------------------------");

        //Remove all the students whose score is less than 90
        for(String eachKey : students.keySet()){
            Integer eachValue = students.get(eachKey);
            if( eachValue < 90){
                System.out.println(eachKey ); // Alex Serkan Ali
            }
        }

        System.out.println("------------------------------------");

        Map<String, Integer> earlyBirds = new HashMap<>(); // score >= 90
        Map<String, Integer> angryBirds = new HashMap<>(); // score < 90

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if(value >= 90){
                earlyBirds.put(key, value);
            }else{
                angryBirds.put(key, value);
            }
        }
        System.out.println("earlyBirds = " + earlyBirds);// earlyBirds = {Andriy=98, Aygun=95, Maria=90, Ozan=99}
        System.out.println("angryBirds = " + angryBirds);// angryBirds = {Alex=80, Serkan=70, Ali=85}

        Set<String> names = students.keySet();// atama yaptık

        System.out.println("--------------------------------------------------------");

// *** =====================  values()  : ===================

        //Collection<Integer> scores = students.values();
        //System.out.println(scores); // [80, 98, 95, 90, 99, 70, 85]

        List<Integer> scores = new ArrayList<>( students.values() );
        System.out.println(scores); // [80, 98, 95, 90, 99, 70, 85]


        for (Integer value : students.values()) {
            System.out.println(value);             //80 98 95...
        }

        System.out.println("--------------------------------------------------------");

// *** ===>  interview Questions  ?????????????????????

        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (Integer score : students.values()) {
            if(score > maxScore){
                maxScore = score;
            }
            if(score < minScore){
                minScore =score;
            }
        }
        System.out.println("maxScore = " + maxScore);// maxScore = 99
        System.out.println("minScore = " + minScore);// minScore = 70

        System.out.println("--------------------------------------------------------");
// *** ===>  interview Questions  ????????????????????? --> bu tercih edilmez ama gostrebıl
        int max = Collections.max( students.values() );
        int min = Collections.min( students.values() );

        System.out.println("max = " + max);// max = 99
        System.out.println("min = " + min);// min = 70

        System.out.println("--------------------------------------------------------");

        // how many students has the score of 95 or greater
        int count = 0;
        for (Integer eachScore : students.values()) {
            if(eachScore >= 95){
                count++;
            }
        }/*
        for (String eachKey : students.keySet()) {
            Integer eachScore = students.get(eachKey);
            if(eachScore >= 95){
                count++;
            }
        }*/
        System.out.println(count); // 3

        System.out.println("--------------------------------------------------------");

// *** =================== entrySet(): ===================

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            //System.out.println(entry); --> tum verier esıtlıkle gelir...
            System.out.println(entry.getKey() +" : " +entry.getValue());
        }// Alex : 80
         // Andriy : 98 ......
    }
}
