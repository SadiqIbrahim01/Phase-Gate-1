score_1 = int(input("Enter first score: "))
score_2 = int(input("Enter second score: "))
score_3 = int(input("Enter third score: "))

average = score_1 + score_2 + score_3 / 3
if average >= 90 and average <= 100:
	print("A")
elif average >= 80 and average < 90:
	print("B")
elif average >= 70 and average < 80:
	print("C")
elif average >= 60 and average < 70:
	print("D")
else:
	print("F")