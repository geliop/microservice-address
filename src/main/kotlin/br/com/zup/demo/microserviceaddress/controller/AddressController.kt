package br.com.zup.demo.microserviceaddress.controller

import br.com.zup.demo.microserviceaddress.service.AddressService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/address")
class AddressController(private val addressService: AddressService) {

    @PostMapping("/{zipCode}")
    @ResponseBody
    fun findAddress(@PathVariable("zipCode") zipCode: String) = addressService.findAddressByZipCode(zipCode)

}