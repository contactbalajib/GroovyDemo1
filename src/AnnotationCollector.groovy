import org.codehaus.groovy.transform.*
import org.codehaus.groovy.ast.*
import org.codehaus.groovy.control.*

@groovy.transform.AnnotationCollector([EqualsAndHashCode, ToString])
@interface Simple {}


@Simple
class User {
 String username
int age
}

def user = new User(username: 'mrhaki', age: 39)
assert user.toString() == 'User(mrhaki, 39)'

// We still have 2 annotations:
assert User.class.annotations.size() == 2


// We can use the attributes from the
// grouped annotations.
@Simple(excludes = 'street')
class Address {
String street, town
}

def address = new Address(street: 'Evergreen Terrace', town: 'Springfield')
assert address.toString() == 'Address(Springfield)'