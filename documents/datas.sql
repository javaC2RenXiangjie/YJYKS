#user表数据
INSERT INTO `yjyks`.`user` (`name`, `pwd`, `gender`, `email`, `id_card`, `phone`, `face`, `area`, `id_status`, `add_time`,`authority`) 
		VALUES ('雍嘉远', '123456', '1', '1021031471@qq.com', '123123123123', '12312312', '123123', 'sh', '1', '2019-05-01 00:00:00', '1');
INSERT INTO `yjyks`.`user` (`name`, `pwd`, `gender`, `email`, `id_card`, `phone`, `face`, `area`, `id_status`, `add_time`,`authority`) 
		VALUES ('rxj', '123456', '1', '1021031472@qq.com', '123123123123', '12312312', '123123', 'sh', '1', '2019-05-01 00:00:00', '2');
INSERT INTO `yjyks`.`user` (`name`, `pwd`, `gender`, `email`, `id_card`, `phone`, `face`, `area`, `id_status`, `add_time`,`authority`) 
		VALUES ('任向杰', '123456', '1', '1021031473@qq.com', '123123123123', '12312312', '123123', 'sh', '1', '2019-05-01 00:00:00', '3');
INSERT INTO `yjyks`.`user` (`name`, `pwd`, `gender`, `email`, `id_card`, `phone`, `face`, `area`, `id_status`, `add_time`,`authority`) 
		VALUES ('雍嘉远1', '123456', '1', '1031031471@qq.com', '123123123123', '12312312', '123123', 'sh', '1', '2019-05-01 00:00:00', '1');
#tsubject表数据
INSERT INTO `yjyks`.`tsubject` (`subject`, `addtime`, `owner`) VALUES ('测试项目2', '2019-5-21', '雍嘉远');
INSERT INTO `yjyks`.`tsubject` (`subject`, `addtime`, `owner`) VALUES ('测试项目3', '2019-5-22', '雍嘉远');
INSERT INTO `yjyks`.`tsubject` (`subject`, `addtime`, `owner`) VALUES ('测试项目4', '2019-5-23', '雍嘉远');
INSERT INTO `yjyks`.`tsubject` (`subject`, `addtime`, `owner`) VALUES ('测试项目5', '2019-5-24', '雍嘉远');
INSERT INTO `yjyks`.`tsubject` (`subject`, `addtime`, `owner`) VALUES ('测试项目6', '2019-5-25', '雍嘉远');

#equip表数据
INSERT INTO `yjyks`.`equip` (`store`, `addtime`, `status`, `instruction`) VALUES ('一号楼', '2019-5-29', '正常', '简介简介简介');
INSERT INTO `yjyks`.`equip` (`store`, `addtime`, `status`, `instruction`) VALUES ('二号楼', '2019-5-28', '正常', '简介简介简介');
INSERT INTO `yjyks`.`equip` (`store`, `addtime`, `status`, `instruction`) VALUES ('三号楼', '2019-5-27', '正常', '简介简介简介');
INSERT INTO `yjyks`.`equip` (`store`, `addtime`, `status`, `instruction`) VALUES ('四号楼', '2019-5-26', '正常', '简介简介简介');
INSERT INTO `yjyks`.`equip` (`store`, `addtime`, `status`, `instruction`) VALUES ('五号楼', '2019-5-25', '正常', '简介简介简介');
INSERT INTO `yjyks`.`equip` (`store`, `addtime`, `status`, `instruction`) VALUES ('六号楼', '2019-5-24', '正常', '简介简介简介');

#trinfo表数据
INSERT INTO `yjyks`.`trinfo` (`teacher_id`, `subject_id`, `num`, `status`, `addtime`) VALUES ('1', '1', '56', '正常上课', '2019-05-30');
INSERT INTO `yjyks`.`trinfo` (`teacher_id`, `subject_id`, `num`, `status`, `addtime`) VALUES ('1', '1', '30', '正常上课', '2019-05-39');
INSERT INTO `yjyks`.`trinfo` (`teacher_id`, `subject_id`, `num`, `status`, `addtime`) VALUES ('1', '1', '98', '正常上课', '2019-05-38');
INSERT INTO `yjyks`.`trinfo` (`teacher_id`, `subject_id`, `num`, `status`, `addtime`) VALUES ('1', '1', '36', '正常上课', '2019-05-37');
INSERT INTO `yjyks`.`trinfo` (`teacher_id`, `subject_id`, `num`, `status`, `addtime`) VALUES ('1', '1', '30', '正常上课', '2019-05-36');
INSERT INTO `yjyks`.`trinfo` (`teacher_id`, `subject_id`, `num`, `status`, `addtime`) VALUES ('1', '1', '38', '正常上课', '2019-05-35');
