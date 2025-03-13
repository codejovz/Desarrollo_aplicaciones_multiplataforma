# -*- coding: utf-8 -*-

from odoo import models, fields, api


class Incidencia(models.Model):
    _name = 'soporte.incidencia'
    _description = 'Modelo para la gestión de incidencias'

    titulo = fields.Char(
        string='Título'
    )

    descripcion = fields.Html(
        string='Descripción'
    )

    prioridad = fields.Selection(
        [
            ('0', 'No'),
            ('1', 'Sí')
        ],
        string='Establece un valor mayor o igual a 10 para que se considere urgente'
    )

    urgente = fields.Selection(
        [
            ('0', 'No'),
            ('1', 'Sí')
        ],
        string='Urgente'
    )

    cerrada = fields.Boolean(
        string='Cerrada'
    )

    imagen = fields.Image(
        string='Imagen',
        max_width=250,
        max_height=250
    )

    fecha_creacion = fields.Datetime(
        string='Fecha de Creación',
        default=fields.Datetime.now
    )

    fecha_modificacion = fields.Date(
        string='Fecha de Modificación',
        default=fields.Date.context_today
    )

    ubicacion = fields.Selection(
        [
            ('oficina', 'Oficina'),
            ('remoto', 'Remoto')
        ],
        string='Ubicación'
    )
