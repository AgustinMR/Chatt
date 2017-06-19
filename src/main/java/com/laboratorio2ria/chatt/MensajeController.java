package com.laboratorio2ria.chatt;

import com.pusher.rest.Pusher;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/mensajes")
public class MensajeController {
    
    @RequestMapping(value = "", method = RequestMethod.POST)
    public void publicarMensaje(@RequestParam(name = "grupo") String grupo, @RequestParam(name = "mensaje") String mensaje){
        Pusher pusher = new Pusher("354776", "c312df6ac515798b218a", "c0dc04df9013d9d70ccf");
        pusher.setCluster("us2");
        pusher.setEncrypted(true);
        pusher.trigger(grupo, "mensaje-nuevo", new Mensaje(grupo, mensaje));
    }
}
