package com.springWeb.demo.data;

import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

/**
 * This is the data-access class where we define the access to the database through 
 * mapper interface
 * The methods are defined in an xml src/main/resources
 * @author ruben
 *
 */
@Mapper
public interface DemoMapper {
 
    String getLanguageByUser(@Param("userName") String userName);
 
    String getMessageByLanguage(@Param("language") String language);
}
