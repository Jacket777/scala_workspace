package sparkmasterworker.common

/**
  * Created by 17081290 on 2020/7/9.
  */
// worker注册信息 //MessageProtocol.scala
case class RegisterWorkerInfo(id: String, cpu: Int, ram: Int)
// 这个是WorkerInfo, 保存在master的hashmap中的
class WorkerInfo(val id: String, val cpu: Int, val ram: Int){
  // 新增
  var lastHeartBeatTime: Long = _
}
case object RegisteredWorkerInfo

//MessageProtocol.scala
case object SendHeartBeat
case class HearBeat(id: String)

//MessageProtocol.scala
//master给自己发送一个触发检查超时worker的信息
case object StartTimeOutWorker
// master给自己发消息，检测worker,对于心跳超时的.
case object RemoveTimeOutWorker



