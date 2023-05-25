import java.time.LocalTime
import java.time.Month

def range = 5..10;
println(range);
println(range.get(2));

println range.getClass()
for(def n: range){
	println n;
}


def numbers = 5..1
for(def n: numbers){
	println n;
}


//Object range
def alphas = 'a'..'d'
println alphas.getClass()
for (def a : alphas) {
	println a
}


//Date range
def monthRange = Month.JANUARY..Month.APRIL
for (def month : monthRange) {
	println month
}

/*
def timeRange = LocalTime.now()..LocalTime.now().plusSeconds(2)
for (def time : timeRange) {
	println time
}
*/


int[] array = [0,1,2,3];

for(int i in array) {
 println(i);
}

for(int i in 1..5) {
	println(i);
 }
 
 def employee = ["Ken" : 21, "John" : 25, "Sally" : 22];
 
for(emp in employee) {
  println(emp);
}



