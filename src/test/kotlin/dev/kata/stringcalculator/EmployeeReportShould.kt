package dev.kata.stringcalculator

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class EmployeeReportShould {
    @Test
    fun `obtainAdultsEmployees`() {
        val employee1 = Employee("Marcos", 30)
        val employee2 = Employee("Ismael", 15)
        val employee3 = Employee("Kika", 34)
        val employee4 = Employee("Anabel", 27)
        val employee5 = Employee("Sonia", 17)

        var report = Report()
        report.addEmployee(employee1)
        report.addEmployee(employee2)
        report.addEmployee(employee3)
        report.addEmployee(employee4)
        report.addEmployee(employee5)

        var listAdults: MutableList<Employee> = arrayListOf()

        for (employee in report.getList()) {
            if (employee.age >= 18) {
                listAdults.add(employee)
            }
        }
        val result = listAdults.count()
        assertThat(result).isEqualTo(3)
    }
    @Test
    fun `obtainEmployeesSorted`() {
        val employee1 = Employee("Marcos", 30)
        val employee2 = Employee("Ismael", 15)
        val employee3 = Employee("Kika", 34)
        val employee4 = Employee("Anabel", 27)
        val employee5 = Employee("Sonia", 17)

        var report = Report()
        report.addEmployee(employee1)
        report.addEmployee(employee2)
        report.addEmployee(employee3)
        report.addEmployee(employee4)
        report.addEmployee(employee5)

        assertThat(report.sortEmployees()[0].name).isEqualTo("Anabel")

        for (employee in report.sortEmployees()) {
            println(employee.name + " " + employee.age)
        }
    }

    @Test
    fun `getCapitalizedList`() {
        val employee1 = Employee("Marcos", 30)
        val employee2 = Employee("Ismael", 15)
        val employee3 = Employee("Kika", 34)
        val employee4 = Employee("Anabel", 27)
        val employee5 = Employee("Sonia", 17)

        var report = Report()
        report.addEmployee(employee1)
        report.addEmployee(employee2)
        report.addEmployee(employee3)
        report.addEmployee(employee4)
        report.addEmployee(employee5)

        assertThat(report.capitalizedLetters()[0].name).isEqualTo("MARCOS")

        for (employee in report.capitalizedLetters()) {
            println(employee.name + " " + employee.age)
        }
    }

    @Test
    fun `descendingOrder`() {
        val employee1 = Employee("Marcos", 30)
        val employee2 = Employee("Ismael", 15)
        val employee3 = Employee("Kika", 34)
        val employee4 = Employee("Anabel", 27)
        val employee5 = Employee("Sonia", 17)

        var report = Report()
        report.addEmployee(employee1)
        report.addEmployee(employee2)
        report.addEmployee(employee3)
        report.addEmployee(employee4)
        report.addEmployee(employee5)

        for (employee in report.descendingOrder()) {
            println(employee.name + " " + employee.age)
        }
    }
}
