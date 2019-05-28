create database yjyks CHARACTER SET gbk;

use yjyks;

create table admin(
	id int auto_increment,#管理员编号
    name varchar(100),#管理员姓名
    pwd varchar(100),#管理员密码
    is_super varchar(100),#管理员类型
    addtime datetime,#添加时间
    primary key(id)
);

create table adminlog(
	id int auto_increment,#登录日志编号
    admin_id int,#管理员id
    ip BINARY,#登录地所在ip
    addtime datetime,#添加时间
    primary key(id)
);

create table oplog(
	id int auto_increment,#操作日志编号
    admin_id int,#管理员id
    ip BINARY,#登录地所在ip
    opdetail varchar(600),#操作详情
    addtime datetime,#添加时间
    primary key(id)
);

create table user(
	id int auto_increment,#用户编号
    name varchar(100),#用户姓名
    pwd varchar(30),#用户密码
    gender smallint,#用户性别
    email varchar(30),#用户邮箱
    id_card varchar(18),#用户身份证
    phone varchar(11),#用户手机
    face varchar(255),#用户照片
    area varchar(200),#用户所在地区
	id_status smallint,#身份证状态
    add_time datetime,#添加时间
    primary key(id)
);
create table user_log(
	id int auto_increment,#登录日志编号
    user_id int,#用户id
    ip varchar(100),#登录地所在ip
    addtime datetime,#添加时间
    primary key(id)
);

create table ref_book(
	id int auto_increment,#指导书编号
    title varchar(100),#指导书名称
    pages int,#页码
    addtime datetime,#添加时间
    primary key(id)
);

create table tsubject( 
	id int auto_increment,#项目编号
    subject varchar(100),#名称
    addtime datetime,#添加时间
    primary key(id)
);

create table tinfo(
	id int auto_increment,#信息编号
    level_id int,#年级编号
    subject_id int,#科室编号
    t_time datetime,#使用时间
    area varchar(100),#存放地点
    examroom varchar(100),#实验室
    personnum int,#使用人数
    price float,#设备价格
    refbook_id int,#指导书id
    addtime datetime,#添加时间
    primary key(id)
);

create table trinfo(
	id int auto_increment,#课程编号
    teacher_id int,#教师编号
    subject_id int,#科目编号
    num int,#课程人数
    status varchar(10),#课程状态
    addtime datetime,#添加时间
    primary key(id)
);
create table viosinfo(
	id int auto_increment,#视频编号
    title varchar(100),#视频编号
    contetn varchar(20000),#视频
    view_num int,#视频浏览量
    admin_id int,#管理员id
    newstag_id int,#标签id
    img varchar(300),#视频图片
    remark varchar(600),#备注
    addtime datetime,#添加时间
	primary key(id)
);
INSERT INTO `yjyks`.`user` (`name`, `pwd`, `gender`, `email`, `id_card`, `phone`, `face`, `area`, `id_status`, `add_time`) 
		VALUES ('雍嘉远', '123456', '1', '1021031476@qq.com', '123123123123', '12312312', '123123', 'sh', '1', '2019-05-01 00:00:00');
INSERT INTO `yjyks`.`user` (`name`, `pwd`, `gender`, `email`, `id_card`, `phone`, `face`, `area`, `id_status`, `add_time`) 
		VALUES ('rxj', '123456', '1', '1021031476@qq.com', '123123123123', '12312312', '123123', 'sh', '1', '2019-05-01 00:00:00');
INSERT INTO `yjyks`.`user` (`name`, `pwd`, `gender`, `email`, `id_card`, `phone`, `face`, `area`, `id_status`, `add_time`) 
		VALUES ('任向杰', '123456', '1', '1021031476@qq.com', '123123123123', '12312312', '123123', 'sh', '1', '2019-05-01 00:00:00');
INSERT INTO `yjyks`.`user` (`name`, `pwd`, `gender`, `email`, `id_card`, `phone`, `face`, `area`, `id_status`, `add_time`) 
		VALUES ('雍嘉远1', '123456', '1', '1021031476@qq.com', '123123123123', '12312312', '123123', 'sh', '1', '2019-05-01 00:00:00');



