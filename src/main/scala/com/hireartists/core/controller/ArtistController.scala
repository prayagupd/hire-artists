package com.hireartists.core.controller

import com.hireartists.core.services.ArtistService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod}

@Controller
@RequestMapping(Array("/"))
class ArtistController @Autowired() (artistService: ArtistService) {

  @RequestMapping(method = Array(RequestMethod.GET))
  def index (model: Model) = {
    model.addAttribute("name", artistService.getArtists)
    "index"
  }

}
