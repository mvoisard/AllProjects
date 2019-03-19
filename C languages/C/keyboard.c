/*=================================================
Program Name: keyboard.c
Purpose:      Enter data using the keyboard
================================================ */
#include <stdio.h> /* the standard input/output library */
int main()
  {
  char string[50]; /* a string field */
  float my_money; /* a floating decimal field */
  int weight; /* an integer field */
  printf("\nEnter your First Name: ");
  scanf("%s", string);
  printf("\nEnter your Desired Monthly Income: ");
  scanf("%f", &my_money);
  printf("\nEnter your friend's weight: ");
  scanf("%d", &weight);
  printf("\n\n Recap\n");
  printf("I am %s and I wish to have %6.2f per month", string, my_money);
  printf("\nI never would have guessed your friend weighs %d lbs", weight);
  printf("\n\n");
}
