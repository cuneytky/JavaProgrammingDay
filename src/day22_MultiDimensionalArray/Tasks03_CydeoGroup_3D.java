package day22_MultiDimensionalArray;
public class Tasks03_CydeoGroup_3D {
    public static void main(String[] args) {
 //1. given the following arrays:
        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

 //2. declare an array variable named batch25Groups
        String[][] batch25Groups = {
                {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"},
                {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"},
                {"Fady", "Break", "Clock", "Cihad", "Muhtar"}
        };
 // 3. given the following arrays:
        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

 // 4. declare an array variable named batch24Groups
        String[][] batch24Groups = { batch24Group1, batch24Group2, batch24Group3};

 // 5. declare an array variable named CydeoStudents and assign batch24Groups & batch25Groups
        String [][][] cydeoStudents ={ batch24Groups,batch25Groups};

 // 6. Print the names of each students
        for (String[][] groupClass : cydeoStudents) {
            for (String[] eachClass : groupClass) {
                for (String eachStudent : eachClass) {
                    System.out.print(eachStudent+"\t");
                }
            }
        }
    }
}
/*
3. CydeoStudents Task:
		1. given the following arrays:
		 		String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
		 		String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
		 		String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

		2. declare an array variable named batch25Groups with the length of three
				2.1 Assign batch25Group1, batch25Group2, batch25Group1=3 to each indexes of the variable batch25Groups

		3. given the following arrays:
				String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
		 		String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
		 		String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

 		4. declare an array variable named batch24Groups with the length of
 				4.1 Assign batch24Group1, batch24Group2, batch24Group1=3 to each indexes of the variable batch25Groups


		5. declare an array variable named CydeoStudents and assign batch24Groups & batch25Groups to the indexes of CydeoStudents

		6. Print the names of each students
 */