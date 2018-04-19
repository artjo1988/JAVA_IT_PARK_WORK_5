package com.company.Repository;

import com.company.Model.User;

/**
 * Created by Макс on 19.04.2018.
 */
public interface Crud {

   void find (int id);
   void create (User user);
   void update (int id, User user);
   void delete (int id);
   User [] finfAll();

}
