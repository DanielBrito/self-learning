# -*- coding: utf-8 -*-
"""
Created on Sun Aug 11 19:27:58 2019

@author: Daniel Brito
"""
import random

def guessNumber(n):
    
    lower=0
    higher=100
    
    print("Please think of a number between 0 and 100!")
    
    while 1:
        
        guess = random.randint(lower,higher)
        
        print("\nIs your secret number " + str(guess) + "?\n")
        
        print("Enter 'h' to indicate the guess is too high.")
        print("Enter 'l' to indicate the guess is too low.")
        print("Enter 'c' to indicate I guessed correctly.")
        
        answer = input("Hint: ")
        
        if answer=='h':
            lower = guess
        elif answer=='l':
            higher = guess
        else:
            print("\nGame over. Your secret number was: " + str(guess))   
            break

n = 10
guessNumber(n)