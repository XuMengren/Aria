/*
 * Copyright (C) 2016 AriaLyy(https://github.com/AriaLyy/Aria)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.arialyy.aria.core.inf;

import com.arialyy.aria.core.download.DownloadGroupEntity;

/**
 * 组合任务实体包裹器，用于加载和任务相关的参数，如：组合任务实体{@link DownloadGroupEntity}、header头部
 */
public interface ITaskWrapper<ENTITY extends AbsEntity> {

  /**
   * HTTP单任务载
   */
  int D_HTTP = 0x11;
  /**
   * HTTP任务组下载
   */
  int DG_HTTP = 0x12;

  /**
   * FTP单文件下载
   */
  int D_FTP = 0x13;
  /**
   * FTP文件夹下载，为避免登录过多，子任务由单线程进行处理
   */
  int D_FTP_DIR = 0x14;

  /**
   * HTTP单文件上传
   */
  int U_HTTP = 0xA1;
  /**
   * FTP单文件上传
   */
  int U_FTP = 0xA2;

  ENTITY getEntity();
}
