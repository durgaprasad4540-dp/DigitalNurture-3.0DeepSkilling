

class Employee:
    
    def __init__(self, name, hours_worked, hourly_rate):
        self.name = name
        self.hours_worked = hours_worked
        self.hourly_rate = hourly_rate
        
    def calculate_pay(self):
        if self.hours_worked > 40:
            overtime_hours = self.hours_worked - 40
            overtime_pay = overtime_hours * (1.5 * self.hourly_rate)
            regular_pay = 40 * self.hourly_rate
            total_pay = regular_pay + overtime_pay
        else:
            total_pay = self.hours_worked * self.hourly_rate
        return total_pay
            

class Manager(Employee):
    def __init__(self, name, hours_worked, hourly_rate, bonus):
        super().__init__(name, hours_worked, hourly_rate)
        self.bonus = bonus
        
        def calculate_pay(self):
            base_pay = super().calculate_pay()
            total_pay = base_pay + self.bonus
            return total_pay
        

Rahul = Employee("Rahul", 45, 20)
Kunal = Manager("Kunal", 50, 30, 500)


print(f"{Rahul.name}'s Total Pay: ${Rahul.calculate_pay():.2f}")
print(f"{Kunal.name}'s Total pay: ${Kunal.calculate_pay():.2f}")
            
            

    