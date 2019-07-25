package com.newer.demo3.mapper;

import com.newer.demo3.domain.Attention;
import com.newer.demo3.domain.Upload;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UploadMapper {

    @Select("select * from upload")
    public List<Upload> selAll();


    //推荐方案1 先查出用户关注的人的作品和关注类型的作品
    @Select("select uploadid from upload where userid in (select adverseid from attention where myid=#{id} and type=1) or sortedID in (select adverseid from attention where myid=#{id} and type=2)")
    public List<Integer> tui1(@Param("id") Integer id);

    //推荐方案2 随机推荐
    @Select("select u.*,count(l.answerid) count from(select * from upload) u, (select * from answer_comments) l where l.answerid=u.uploadid and l.type=0 and u.userid=#{id} or l.userid=#{id1} group by l.answerid;")
    public List<Upload> tui2(@Param("id") Integer id,@Param("id1") Integer id1);


    //计算总数
    @Select("select count(userid) from upload")
    public int sum();


    //查询点赞，评论数，
    @Select("select u.*,count(l.answerid) count from(select * from upload) u, (select * from answer_comments) l where l.answerid=u.uploadid and l.type=0 and u.uploadid=#{myid} group by l.answerid")
    public Upload za(@Param("myid") Integer myid);

   //关注的问题数，
    @Select("select count(adverseid) from attention where type=0 and Myid=#{myid}")
    public Integer issue(@Param("myid")Integer myid);

    //别人对你的邀请总数
    @Select("select count(Userid) from invite where myid=#{myid}")
    public Integer invite(@Param("myid")Integer myid);


  /*  //查询所有的评论
    @Select("select * from ")
*/

}
