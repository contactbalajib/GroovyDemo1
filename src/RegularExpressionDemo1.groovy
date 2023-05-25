//regular expressions
def str = 'Groovy'
println str =~ 'Groovy'
println str =~ 'oo'
println str ==~ 'Groovy'
println str ==~ 'oo'
println str =~ '∧G'
println str =~ 'G$'
println str =~ 'Gro*vy' 
println str =~ 'Gro{2}vy'

def ipAddress = ~/([0-9]+\.[0-9]+\.[0-9]+\.[0-9]+)/
println ipAddress.class.name // java.util.regex.Pattern

def matcher = ("127.0.0.1" =~ /([0-9]+\.[0-9]+\.[0-9]+\.[0-9]+)/)
println matcher.class.name // java.util.regex.Matcher

def nameRegex = ~'john'
println nameRegex.matcher("john").matches() // true
 
def ipAddressRegex = ~/([0-9]+\.[0-9]+\.[0-9]+\.[0-9]+)/
println ipAddressRegex.matcher("127.0.0.1").matches() // true

def pattern = ~'L....e'
println pattern.matcher("Little").matches() // true

def isCasePattern = ~/L\w+e/
println isCasePattern.isCase("Little") //true



def grepPattern = ~/A\w+/
def cities = ['Alabama', 'Los Angeles', 'Arizona']
println cities.grep(grepPattern) // [Alabama, Arizona]




def numbers = ('5 is greater than 4' =~ /\d+/)
println numbers // java.util.regex.Matcher[pattern=\d+ region=0,19 lastmatch=]
println numbers.size() // 2
println numbers[0] // 5



