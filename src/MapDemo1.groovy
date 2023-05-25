class Example {
	static void main(String[] args) {
	   def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]
	   println(mp.containsKey("TopicName"));
	   println(mp.containsKey("Topic"));
	   
	   println(mp.get("TopicName"));
	   println(mp.get("Topic"));
 
	   println(mp.keySet());
	   
	   mp.put("TopicID","1");
	   println(mp);
	   println(mp.size());
	   println(mp.values());
	}
 }