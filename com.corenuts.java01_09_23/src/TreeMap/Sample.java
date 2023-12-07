//package TreeMap;
//
//public class Sample {
//	 public static void main(String args[]) {
//	        List<Student> studlist = new ArrayList<Student>();
//	        // Adding students to the list
//
//	        // Initialize a HashMap to store grouped students
//	        Map<String, List<Student>> groupedStudents = new HashMap<String, List<Student>>();
//
//	        // Loop through the student list
//	        for (Student student : studlist) {
//	            String key = student.getStudentLocation();
//
//	            // Check if the location is already a key in the map
//	            if (groupedStudents.containsKey(key)) {
//	                // If yes, get the list of students for that location and add the current student
//	                groupedStudents.get(key).add(student);
//	            } else {
//	                // If no, create a new list with the current student and put it in the map
//	                List<Student> newList = new ArrayList<Student>();
//	                newList.add(student);
//	                groupedStudents.put(key, newList);
//	            }
//	        }
//
//	        // Iterate through the grouped students and print the counts
//	        Set<String> locations = groupedStudents.keySet();
//	        for (String location : locations) {
//	            List<Student> studentsAtLocation = groupedStudents.get(location);
//	            int studentCount = studentsAtLocation.size();
//	            System.out.println("Location: " + location + ", Student Count: " + studentCount);
//	        }
//	    }
//	}
//
//
