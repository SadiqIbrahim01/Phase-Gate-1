class Day4:
    def __init__(self):
        self.grocery_list = []
    
    def add_to_list(self, item):
        self.grocery_list.append(item)
        print(f"{item} has been added to list.")
    
    def remove_from_list(self, item):
        if item in self.grocery_list:
            self.grocery_list.remove(item)
            print(f"{item} has been removed from the list")
        else:
            print(f"{item} is not in the list")
    
    def show_the_list(self):
        if not self.grocery_list:
            print("Nothing has been added to your list")
        else:
            for item in self.grocery_list:
                print(item)

def main():
    manager = Day4()
    print("Welcome to Grocery Manager.")
    print()

   