// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.oneof.Form in form.proto
import Foundation
import Wire

public struct Form {

    public var choice: Choice?
    public var decision: Decision?
    public var unknownFields: Data = .init()

    public init(choice: Choice? = nil, decision: Decision? = nil) {
        self.choice = choice
        self.decision = decision
    }

    public enum Choice {

        case button_element(ButtonElement)
        case local_image_element(LocalImageElement)
        case remote_image_element(RemoteImageElement)
        case money_element(MoneyElement)
        case spacer_element(SpacerElement)
        case text_element(TextElement)
        case customized_card_element(CustomizedCardElement)
        case address_element(AddressElement)
        case text_input_element(TextInputElement)
        @available(*, deprecated)
        case option_picker_element(OptionPickerElement)
        case detail_row_element(DetailRowElement)
        case currency_conversion_flags_element(CurrencyConversionFlagsElement)

        fileprivate func encode(to writer: ProtoWriter) throws {
            switch self {
            case .button_element(let button_element): try writer.encode(tag: 1, value: button_element)
            case .local_image_element(let local_image_element): try writer.encode(tag: 2, value: local_image_element)
            case .remote_image_element(let remote_image_element): try writer.encode(tag: 3, value: remote_image_element)
            case .money_element(let money_element): try writer.encode(tag: 4, value: money_element)
            case .spacer_element(let spacer_element): try writer.encode(tag: 5, value: spacer_element)
            case .text_element(let text_element): try writer.encode(tag: 6, value: text_element)
            case .customized_card_element(let customized_card_element): try writer.encode(tag: 7, value: customized_card_element)
            case .address_element(let address_element): try writer.encode(tag: 8, value: address_element)
            case .text_input_element(let text_input_element): try writer.encode(tag: 9, value: text_input_element)
            case .option_picker_element(let option_picker_element): try writer.encode(tag: 10, value: option_picker_element)
            case .detail_row_element(let detail_row_element): try writer.encode(tag: 11, value: detail_row_element)
            case .currency_conversion_flags_element(let currency_conversion_flags_element): try writer.encode(tag: 12, value: currency_conversion_flags_element)
            }
        }

    }

    public enum Decision {

        case a(String)
        case b(String)
        case c(String)
        case d(String)
        case e(String)
        case f(String)
        case g(String)
        case h(String)

        fileprivate func encode(to writer: ProtoWriter) throws {
            switch self {
            case .a(let a): try writer.encode(tag: 101, value: a)
            case .b(let b): try writer.encode(tag: 102, value: b)
            case .c(let c): try writer.encode(tag: 103, value: c)
            case .d(let d): try writer.encode(tag: 104, value: d)
            case .e(let e): try writer.encode(tag: 105, value: e)
            case .f(let f): try writer.encode(tag: 106, value: f)
            case .g(let g): try writer.encode(tag: 107, value: g)
            case .h(let h): try writer.encode(tag: 108, value: h)
            }
        }

    }

    public struct ButtonElement {

        public var unknownFields: Data = .init()

        public init() {
        }

    }

    public struct LocalImageElement {

        public var unknownFields: Data = .init()

        public init() {
        }

    }

    public struct RemoteImageElement {

        public var unknownFields: Data = .init()

        public init() {
        }

    }

    public struct MoneyElement {

        public var unknownFields: Data = .init()

        public init() {
        }

    }

    public struct SpacerElement {

        public var unknownFields: Data = .init()

        public init() {
        }

    }

    public struct TextElement {

        public var text: String?
        public var unknownFields: Data = .init()

        public init(text: String? = nil) {
            self.text = text
        }

    }

    public struct CustomizedCardElement {

        public var unknownFields: Data = .init()

        public init() {
        }

    }

    public struct AddressElement {

        public var unknownFields: Data = .init()

        public init() {
        }

    }

    public struct TextInputElement {

        public var unknownFields: Data = .init()

        public init() {
        }

    }

    public struct OptionPickerElement {

        public var unknownFields: Data = .init()

        public init() {
        }

    }

    public struct DetailRowElement {

        public var unknownFields: Data = .init()

        public init() {
        }

    }

    public struct CurrencyConversionFlagsElement {

        public var unknownFields: Data = .init()

        public init() {
        }

    }

}

#if !WIRE_REMOVE_EQUATABLE
extension Form.Choice : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.Choice : Hashable {
}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.Decision : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.Decision : Hashable {
}
#endif

#if !WIRE_REMOVE_REDACTABLE
extension Form.Decision : Redactable {
    public enum RedactedKeys : String, RedactedKey {

        case e

    }
}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.ButtonElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.ButtonElement : Hashable {
}
#endif

extension Form.ButtonElement : Proto2Codable {
    public init(from reader: ProtoReader) throws {
        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension Form.ButtonElement : Codable {
}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.LocalImageElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.LocalImageElement : Hashable {
}
#endif

extension Form.LocalImageElement : Proto2Codable {
    public init(from reader: ProtoReader) throws {
        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension Form.LocalImageElement : Codable {
}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.RemoteImageElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.RemoteImageElement : Hashable {
}
#endif

extension Form.RemoteImageElement : Proto2Codable {
    public init(from reader: ProtoReader) throws {
        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension Form.RemoteImageElement : Codable {
}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.MoneyElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.MoneyElement : Hashable {
}
#endif

extension Form.MoneyElement : Proto2Codable {
    public init(from reader: ProtoReader) throws {
        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension Form.MoneyElement : Codable {
}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.SpacerElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.SpacerElement : Hashable {
}
#endif

extension Form.SpacerElement : Proto2Codable {
    public init(from reader: ProtoReader) throws {
        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension Form.SpacerElement : Codable {
}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.TextElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.TextElement : Hashable {
}
#endif

extension Form.TextElement : Proto2Codable {
    public init(from reader: ProtoReader) throws {
        var text: String? = nil

        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            case 1: text = try reader.decode(String.self)
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

        self.text = text
    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.encode(tag: 1, value: self.text)
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension Form.TextElement : Codable {
    public enum CodingKeys : String, CodingKey {

        case text

    }
}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.CustomizedCardElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.CustomizedCardElement : Hashable {
}
#endif

extension Form.CustomizedCardElement : Proto2Codable {
    public init(from reader: ProtoReader) throws {
        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension Form.CustomizedCardElement : Codable {
}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.AddressElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.AddressElement : Hashable {
}
#endif

extension Form.AddressElement : Proto2Codable {
    public init(from reader: ProtoReader) throws {
        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension Form.AddressElement : Codable {
}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.TextInputElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.TextInputElement : Hashable {
}
#endif

extension Form.TextInputElement : Proto2Codable {
    public init(from reader: ProtoReader) throws {
        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension Form.TextInputElement : Codable {
}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.OptionPickerElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.OptionPickerElement : Hashable {
}
#endif

extension Form.OptionPickerElement : Proto2Codable {
    public init(from reader: ProtoReader) throws {
        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension Form.OptionPickerElement : Codable {
}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.DetailRowElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.DetailRowElement : Hashable {
}
#endif

extension Form.DetailRowElement : Proto2Codable {
    public init(from reader: ProtoReader) throws {
        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension Form.DetailRowElement : Codable {
}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.CurrencyConversionFlagsElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.CurrencyConversionFlagsElement : Hashable {
}
#endif

extension Form.CurrencyConversionFlagsElement : Proto2Codable {
    public init(from reader: ProtoReader) throws {
        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension Form.CurrencyConversionFlagsElement : Codable {
}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form : Hashable {
}
#endif

extension Form : Proto2Codable {
    public init(from reader: ProtoReader) throws {
        var choice: Form.Choice? = nil
        var decision: Form.Decision? = nil

        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            case 1: choice = .button_element(try reader.decode(Form.ButtonElement.self))
            case 2: choice = .local_image_element(try reader.decode(Form.LocalImageElement.self))
            case 3: choice = .remote_image_element(try reader.decode(Form.RemoteImageElement.self))
            case 4: choice = .money_element(try reader.decode(Form.MoneyElement.self))
            case 5: choice = .spacer_element(try reader.decode(Form.SpacerElement.self))
            case 6: choice = .text_element(try reader.decode(Form.TextElement.self))
            case 7: choice = .customized_card_element(try reader.decode(Form.CustomizedCardElement.self))
            case 8: choice = .address_element(try reader.decode(Form.AddressElement.self))
            case 9: choice = .text_input_element(try reader.decode(Form.TextInputElement.self))
            case 10: choice = .option_picker_element(try reader.decode(Form.OptionPickerElement.self))
            case 11: choice = .detail_row_element(try reader.decode(Form.DetailRowElement.self))
            case 12: choice = .currency_conversion_flags_element(try reader.decode(Form.CurrencyConversionFlagsElement.self))
            case 101: decision = .a(try reader.decode(String.self))
            case 102: decision = .b(try reader.decode(String.self))
            case 103: decision = .c(try reader.decode(String.self))
            case 104: decision = .d(try reader.decode(String.self))
            case 105: decision = .e(try reader.decode(String.self))
            case 106: decision = .f(try reader.decode(String.self))
            case 107: decision = .g(try reader.decode(String.self))
            case 108: decision = .h(try reader.decode(String.self))
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

        self.choice = choice
        self.decision = decision
    }

    public func encode(to writer: ProtoWriter) throws {
        if let choice = self.choice {
            try choice.encode(to: writer)
        }
        if let decision = self.decision {
            try decision.encode(to: writer)
        }
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension Form : Codable {
    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: Form.CodingKeys.self)
        if container.contains(.button_element) {
            let button_element = try container.decode(Form.ButtonElement.self, forKey: .button_element)
            self.choice = .button_element(button_element)
        } else if container.contains(.local_image_element) {
            let local_image_element = try container.decode(Form.LocalImageElement.self, forKey: .local_image_element)
            self.choice = .local_image_element(local_image_element)
        } else if container.contains(.remote_image_element) {
            let remote_image_element = try container.decode(Form.RemoteImageElement.self, forKey: .remote_image_element)
            self.choice = .remote_image_element(remote_image_element)
        } else if container.contains(.money_element) {
            let money_element = try container.decode(Form.MoneyElement.self, forKey: .money_element)
            self.choice = .money_element(money_element)
        } else if container.contains(.spacer_element) {
            let spacer_element = try container.decode(Form.SpacerElement.self, forKey: .spacer_element)
            self.choice = .spacer_element(spacer_element)
        } else if container.contains(.text_element) {
            let text_element = try container.decode(Form.TextElement.self, forKey: .text_element)
            self.choice = .text_element(text_element)
        } else if container.contains(.customized_card_element) {
            let customized_card_element = try container.decode(Form.CustomizedCardElement.self, forKey: .customized_card_element)
            self.choice = .customized_card_element(customized_card_element)
        } else if container.contains(.address_element) {
            let address_element = try container.decode(Form.AddressElement.self, forKey: .address_element)
            self.choice = .address_element(address_element)
        } else if container.contains(.text_input_element) {
            let text_input_element = try container.decode(Form.TextInputElement.self, forKey: .text_input_element)
            self.choice = .text_input_element(text_input_element)
        } else if container.contains(.option_picker_element) {
            let option_picker_element = try container.decode(Form.OptionPickerElement.self, forKey: .option_picker_element)
            self.choice = .option_picker_element(option_picker_element)
        } else if container.contains(.detail_row_element) {
            let detail_row_element = try container.decode(Form.DetailRowElement.self, forKey: .detail_row_element)
            self.choice = .detail_row_element(detail_row_element)
        } else if container.contains(.currency_conversion_flags_element) {
            let currency_conversion_flags_element = try container.decode(Form.CurrencyConversionFlagsElement.self, forKey: .currency_conversion_flags_element)
            self.choice = .currency_conversion_flags_element(currency_conversion_flags_element)
        } else {
            self.choice = nil
        }
        if container.contains(.a) {
            let a = try container.decode(String.self, forKey: .a)
            self.decision = .a(a)
        } else if container.contains(.b) {
            let b = try container.decode(String.self, forKey: .b)
            self.decision = .b(b)
        } else if container.contains(.c) {
            let c = try container.decode(String.self, forKey: .c)
            self.decision = .c(c)
        } else if container.contains(.d) {
            let d = try container.decode(String.self, forKey: .d)
            self.decision = .d(d)
        } else if container.contains(.e) {
            let e = try container.decode(String.self, forKey: .e)
            self.decision = .e(e)
        } else if container.contains(.f) {
            let f = try container.decode(String.self, forKey: .f)
            self.decision = .f(f)
        } else if container.contains(.g) {
            let g = try container.decode(String.self, forKey: .g)
            self.decision = .g(g)
        } else if container.contains(.h) {
            let h = try container.decode(String.self, forKey: .h)
            self.decision = .h(h)
        } else {
            self.decision = nil
        }
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: Form.CodingKeys.self)
        switch self.choice {
        case .button_element(let button_element): try container.encode(button_element, forKey: .button_element)
        case .local_image_element(let local_image_element): try container.encode(local_image_element, forKey: .local_image_element)
        case .remote_image_element(let remote_image_element): try container.encode(remote_image_element, forKey: .remote_image_element)
        case .money_element(let money_element): try container.encode(money_element, forKey: .money_element)
        case .spacer_element(let spacer_element): try container.encode(spacer_element, forKey: .spacer_element)
        case .text_element(let text_element): try container.encode(text_element, forKey: .text_element)
        case .customized_card_element(let customized_card_element): try container.encode(customized_card_element, forKey: .customized_card_element)
        case .address_element(let address_element): try container.encode(address_element, forKey: .address_element)
        case .text_input_element(let text_input_element): try container.encode(text_input_element, forKey: .text_input_element)
        case .option_picker_element(let option_picker_element): try container.encode(option_picker_element, forKey: .option_picker_element)
        case .detail_row_element(let detail_row_element): try container.encode(detail_row_element, forKey: .detail_row_element)
        case .currency_conversion_flags_element(let currency_conversion_flags_element): try container.encode(currency_conversion_flags_element, forKey: .currency_conversion_flags_element)
        case Optional.none: break
        }
        switch self.decision {
        case .a(let a): try container.encode(a, forKey: .a)
        case .b(let b): try container.encode(b, forKey: .b)
        case .c(let c): try container.encode(c, forKey: .c)
        case .d(let d): try container.encode(d, forKey: .d)
        case .e(let e): try container.encode(e, forKey: .e)
        case .f(let f): try container.encode(f, forKey: .f)
        case .g(let g): try container.encode(g, forKey: .g)
        case .h(let h): try container.encode(h, forKey: .h)
        case Optional.none: break
        }
    }

    public enum CodingKeys : String, CodingKey {

        case button_element
        case local_image_element
        case remote_image_element
        case money_element
        case spacer_element
        case text_element
        case customized_card_element
        case address_element
        case text_input_element
        case option_picker_element
        case detail_row_element
        case currency_conversion_flags_element
        case a
        case b
        case c
        case d
        case e
        case f
        case g
        case h

    }
}
#endif
