import java.util.Date

Date date = new Date();

// display time and date using toString()
System.out.println(date.toString());

Date date1 = new Date(100);

// display time and date using toString()
System.out.println(date1.toString());

Date olddate = new Date("05/11/2015");
Date newdate = new Date("05/12/2015");
Date latestdate = new Date();
  
System.out.println(olddate.after(newdate));
System.out.println(newdate.after(newdate));
System.out.println(latestdate.after(newdate));

System.out.println(olddate.equals(newdate));
System.out.println(latestdate.equals(newdate));

System.out.println(olddate.equals(newdate));
System.out.println(latestdate.equals(newdate));


System.out.println(olddate.toString());
System.out.println(newdate.toString());
System.out.println(latestdate.toString());

System.out.println(olddate.before(newdate));
System.out.println(olddate.before(latestdate));

System.out.println(olddate.getTime());
System.out.println(newdate.getTime());
System.out.println(latestdate.getTime());

olddate.setTime(10000);
newdate.setTime(10000);
latestdate.setTime(10000);
  
System.out.println(olddate.toString());
System.out.println(newdate.toString());
System.out.println(latestdate.toString());



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



