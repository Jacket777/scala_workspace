package sparkworker.comm

//worker 注册信息
case class RegisterWorkInfo(id:String,cpu:Int,ram:Int)
//workerInfo ，保存在master的hashmap中 用于管理worker
//后续会被扩展,比如增加worker上一次心跳
class WorkerInfo(val id:String,val cpu:Int,val ram:Int){
  var lastHeartBeat:Long = System.currentTimeMillis()
}
//当worker注册成功，服务器返回这样的实例
case object RegisterWorkInfo

//worker每隔一定时间让定时器发给自己一个消息
case object SendHeartBeat
//worker每隔一定时间，由定时器触发，而向master发现协议消息
case class HeartBeat(id:String)


//master给自己发送一个触发检查超时的worker的信息
case object StartTimeOutWorker
//master给自己发信息，检测woker，对于心跳超时的
case object RemoveTimeOutWorker




