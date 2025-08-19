def get_father_and_son_age(father_age, son_age):
	father_age = (input("Enter father's age: "))
	son_age = (input("Enter son's age: "))
	year_count = 0
	for age in father_age:
		if father_age == age * 2:
			year_count += age
	return year_count

result = get_father_and_son_age(father_age, son_age)

print(f"Father age will be twice of son age in {year_count} years")
	
	