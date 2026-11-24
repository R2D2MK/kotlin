//Accountant.kt — ГЛАВНЫЙ КЛАСС
//Это "бухгалтер" который:
//- Сохраняет товары в файл (serialization)
//- Читает товары из файла (deserialization)
//- Выводит товары
//- Удаляет товары
package corporation

data class Accountant(
    override val id: Int,
    override val name: String,
    override val age: Int,
    override val salary: Int,
) : Worker(
    id,
    name,
    age = age,
    salary = salary,
    position = Position.ACCOUNTANT
), Cleaner, Supplier {

    private val workersRepository = WorkersRepository
    private val productCardRepository = ProductCardRepository


    override fun clean() {
        println("My position is ${position.title}. I'm cleaning workplace...")
    }

    override fun buyThings() {
        println("My position is $${position.title}.I'm buying things!")

    }

    override fun work() {
        val operationCodes = OperationCode.entries
        while (true) {
            println("Enter the operation code. ")
            for ((index, value)
            in operationCodes.withIndex()) {
                print("$index - ${value.description}")
                if (index < operationCodes.size - 1) {
                    print("\n")
                } else print("\n")
            }

            val operationTypeIndex = readln().toInt()
            val operationCodeType
                    : OperationCode = operationCodes[operationTypeIndex]
            when (operationCodeType) {
                OperationCode.EXIT -> {
                    workersRepository.saveChanges()
                    productCardRepository.saveChanges()
                    break
                }

                OperationCode.REGISTER_NEW_ITEM -> registerNewItem()
                OperationCode.SHOW_ALL_ITEMS -> showAllItems()
                OperationCode.REMOVE_PRODUCT_CARD -> removeProductCard()
                OperationCode.REGISTER_NEW_EMPLOYEE -> registerNewEmployee()
                OperationCode.FIRE_AN_EMPLOYEE -> fireEmployee()
                OperationCode.SHOW_ALL_EMPLOYEES -> showAllEmployees()
                OperationCode.CHANGE_SALARY -> changeSalary()
                OperationCode.CHANGE_AGE -> changeAge()
            }
        }
    }

    private fun removeProductCard() {
        print("Enter name of card for removing: ")
        val name = readln()
        productCardRepository.removeProductCard(name)
    }


    private fun showAllItems() {
        val cards = productCardRepository.productsCards
        if (cards.isEmpty()) {
            return
        }
        for (card in cards) {
            card.printInfo()
        }
    }


    private fun registerNewItem() {
        val productTypes = ProductType.entries
        print("Enter the product type. ")
        for ((index, type) in productTypes.withIndex()) {
            print("$index - ${type.title}")
            if (index < productTypes.size - 1) {
                print(", ")
            } else print(": ")
        }
        val productTypeIndex = readln().toInt()
        val productType: ProductType = productTypes[productTypeIndex]
        print("Enter the product name: ")
        val productName = readln()

        print("Enter the product brand: ")
        val productBrand = readln()

        print("Enter the product price: ")
        val productPrice = readln().toInt()


        val card = when (productType) {
            ProductType.FOOD -> {
                print("Enter the product caloric: ")
                val caloric = readln().toInt()
                FoodCard(productName, productBrand, productPrice, caloric)
            }

            ProductType.APPLIANCE -> {
                print("Enter the product wattage: ")
                val wattage = readln().toInt()
                ApplianceCard(productName, productBrand, productPrice, wattage)
            }

            ProductType.SHOE -> {
                print("Enter the product size: ")
                val size = readln().toFloat()
                ShoeCard(productName, productBrand, productPrice, size)
            }

            ProductType.CLOTHES -> {
                print("Enter the product material: ")
                val material = readln()
                ClothesCard(productName, productBrand, productPrice, material)
            }
        }
        productCardRepository.registerNewItem(card)
    }

    private fun registerNewEmployee() {
        val positions = Position.entries
        print("Choose position - ")
        for ((index, type) in positions.withIndex()) {
            print("$index - ${type.title}")
            if (index < positions.size - 1) {
                print(", ")
            } else print(": ")
        }
        val positionIndex = readln().toInt()
        val position = positions[positionIndex]
        print("Enter id: ")
        val id = readln().toInt()
        print("Enter name: ")
        val name = readln()
        print("Enter age: ")
        val age = readln().toInt()
        print("Enter salary: ")
        val salary = readln().toInt()

        val worker = when (position) {
            Position.DIRECTOR -> Director(id, name, age, salary)
            Position.ACCOUNTANT -> Accountant(id, name, age, salary)
            Position.ASSISTANT -> Assistant(id, name, age, salary)
            Position.CONSULTANT -> Consultant(id, name, age, salary)
        }
        workersRepository.registerNewEmployee(worker)
    }

    override fun copy(
        id: Int,
        name: String,
        age: Int,
        salary: Int,
        position: Position
    ): Worker {
       return copy(id = id, name = name, age = age, salary = salary)
    }
//
//    fun copy(
//        id: Int = this.id,
//        name: String = this.name,
//        age: Int = this.age,
//        salary: Int = this.salary
//    ): Accountant {
//        return Accountant(id, name, age, salary)
//    }


    private fun changeSalary() {
        print("Enter employee's id to change salary: ")
        val id = readln().toInt()
        print("Enter new salary: ")
        val salary = readln().toInt()
        workersRepository.changeSalary(id, salary)
    }

    private fun changeAge() {
        print("Enter employee's id to change age: ")
        val id = readln().toInt()
        print("Enter new age: ")
        val age = readln().toInt()
        workersRepository.changeAge(id, age)
    }

    private fun fireEmployee() {
        print("Enter employee's id to fire: ")
        val id = readln().toInt()
        workersRepository.fireEmployee(id)
    }


    private fun showAllEmployees() {
        val employees = workersRepository.workers
        if (employees.isEmpty()) {
            return
        }
        for (employee in employees) {
            employee.printInfo()
        }
    }
}