package dev.kata.stringcalculator

class Report {
    var employees: MutableList<Employee>

    constructor() {
        this.employees = arrayListOf()
    }

    fun getList(): MutableList<Employee> {
        return this.employees
    }

    fun addEmployee(employee: Employee) {
        this.employees.add(employee)
    }

    fun removeEmployee(employee: Employee) {
        this.employees.remove(employee)
    }

    fun sortEmployees(): List<Employee> {
        return this.employees.sortedBy { it.name }
    }

    fun capitalizedLetters(): MutableList<Employee> {
        for (employee in this.employees) {
            employee.name = employee.name.uppercase()
        }

        return this.employees
    }

    fun descendingOrder(): List<Employee> {
        return this.employees.sortedBy { it.name }.reversed()
    }
}