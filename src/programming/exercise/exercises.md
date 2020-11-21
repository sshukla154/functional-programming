# Exercise 1
Print only odd numbers from the list

# Exercise 2
Print all course individually
List<String> courses = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes")

# Exercise 3
Print courses containing the word "Spring"

# Exercise 4
Print courses whose name has at-least 4 letters

# Exercise 5
Print the cubes of odd numbers

# Exercise 6
Print the number of characters in each course name

# Exercise 7
Square every number in a list and find the sum of square

# Exercise 8
Cube every number in a list and fins the sum of cubes

# Exercise 9
Find sum of odd numbers in a list

# Exercise 10
Create a list with even Numbers filtered from Numbers List

# Exercise 11
Create a List with lengths of all course titles

# Exercise 12
Find Functional Interface behind the scene the second argument of reduce method.
Create an implementation for the functional interface 
> int sum = numbers.stream().reduce(0, Integer::sum);

# Exercise 12
Do Behavior Parameterization for the mapping logic.
List squaredNumbers = numbers.stream() .map(x -> x*x) .collect(Collectors.toList());
