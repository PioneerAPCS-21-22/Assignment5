# Assignment 5

For this assignment you will make a program that estimates the value of a square root by using the Babylonian algorithm.

## Specifications

Ask the user to input a number (`s`) and then have them guess what the square root of that number is (`x0`). The value of `x0` should be positive. Once you have those two values, apply the formula `(x1 = x0 + s / x0) / 2`. The value of `x1` will be a better approximation than `x0`. Apply the formula three more times by replacing `x0` with the new approximation (`x1`).

Your final approximation will be `x1`.

### Sample Outputs

```
Square root of what number? 50
Make a guess: 5
The square root of 50.0 is approximately 7.07106781187345
```

```
Square root of what number? 15000
Make a guess: 100
The square root of 15000.0 is approximately 122.47448713915892
```

### Grading

Your program will be graded on its functionality according to the project specifications and proper code style (following naming conventions for identifiers, proper indentation, and proper spacing). Also, remember to update the comment at the top of the file with your name and the date.

