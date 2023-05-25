def rint = 1..10;
def rintReverse = 20..10;

println(rint.contains(2));
println(rint.contains(11));

println(rint.get(2));
println(rint.get(4));
println(rint.get(9))
//println(rint.get(10)) // java.lang.IndexOutOfBoundsException: Index: 10 too big for range: 1..10(rint.get(9))

println(rint.size());
println(rint.getFrom());
println(rint.getTo());
println(rint.reverse);
println(rintReverse.reverse);
println(rintReverse.isReverse());
println(rint.disjoint(rintReverse))

println(rint.subList(1,4));
println(rint.subList(4,8));


def lst = [11, 12, 13, 14];
def newlst = [];

newlst = lst.minus([12,13]);
println(newlst);

newlst = lst.plus([15,16]);
println(newlst);

println(lst);
println(lst.pop());
println(lst);