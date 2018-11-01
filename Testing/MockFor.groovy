

class Person {
    String first, last
}

class Family {
    Person father, mother
    def nameOfMother() { "$mother.first $mother.last" }
}

def mock = new MockFor(Person)      
mock.demand.getFirst{ 'dummy' }
mock.demand.getLast{ 'name' }
mock.use {                          
    def mary = new Person(first:'Mary', last:'Smith')
    def f = new Family(mother:mary)
    assert f.nameOfMother() == 'dummy name'
}
mock.expect.verify() 