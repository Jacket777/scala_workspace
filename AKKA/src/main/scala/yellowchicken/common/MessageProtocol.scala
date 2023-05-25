package yellowchicken.common

/**
  * Created by 17081290 on 2020/7/10.
  */

//使用样例类来构建协议
//客户端发送给服务器协议【序列化的对象】
case class ClientMessage(mes:String)
//服务器端发给客户端的协议
case class ServerMessage(mes:String)
