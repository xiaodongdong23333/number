-- 业务资料主表
CREATE TABLE `main_file_table` (
  `main_file_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主文件id', -- AUTO_INCREMENT可使id递增
  `upload_file_id` int(10) NOT NULL COMMENT '上传文件id',
  `update_file_id` varchar(200) NOT NULL COMMENT '更新文件id', -- 可能多次更新，存储多个id
  PRIMARY KEY (`main_file_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '业务资料主表';

-- 业务资料上传表
CREATE TABLE `upload_file_table` (
  `upload_file_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '上传文件id',
  `upload_file_name` varchar(200) NOT NULL COMMENT '上传文件名称', -- 确保足够容下文件名称
  `upload_file_secret_level` varchar(50) NOT NULL COMMENT '上传文件密',
  `upload_file_release_number` varchar(50) COMMENT '上传文件号',
  `upload_file_release_time` date NOT NULL COMMENT '上传文件发时间',
  `upload_file_link` varchar(200) NOT NULL COMMENT '上传文件链接',
  `upload_person_id` int(10) NOT NULL COMMENT '上传人id', -- 自动识别
  `upload_time` date NOT NULL COMMENT '上传时间', -- 自动填写
  `upload_remarks` varchar(1000) COMMENT '上传备注',
  PRIMARY KEY (`upload_file_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '业务资料上传表';

-- 业务资料更新表
CREATE TABLE `update_file_table` (
  `update_file_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '更新文件id',
  `update_file_secret_level` varchar(50) NOT NULL COMMENT '更新文件密',
  `update_file_link` varchar(200) NOT NULL COMMENT '更新文件链接',
  `update_person_id` int(10) NOT NULL COMMENT '更新人id',
  `update_time` date NOT NULL COMMENT '更新时间',
  `update_explanation` varchar(1000) NOT NULL COMMENT '更新说明',
  `update_remarks` varchar(1000) COMMENT '更新备注',
  PRIMARY KEY (`update_file_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '业务资料更新表';


-- 初始化数据
INSERT INTO `main_file_table` (`main_file_id`, `upload_file_id`, `update_file_id`)
VALUES (111, 222, 333);

