// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.oneof.OneOfMessage in one_of.proto
import Foundation
import Wire

/**
 * It's a one of message.
 */
public struct OneOfMessage {

    /**
     * Must have a foo or a bar or a baz.
     */
    public var choice: Choice?
    public var unknownFields: Data = .init()

    public init(choice: Choice? = nil) {
        self.choice = choice
    }

    public enum Choice {

        /**
         * What foo.
         */
        case foo(Int32)
        /**
         * Such bar.
         */
        case bar(String)
        /**
         * Nice baz.
         */
        case baz(String)

        fileprivate func encode(to writer: ProtoWriter) throws {
            switch self {
            case .foo(let foo): try writer.encode(tag: 1, value: foo)
            case .bar(let bar): try writer.encode(tag: 3, value: bar)
            case .baz(let baz): try writer.encode(tag: 4, value: baz)
            }
        }

    }

}

extension OneOfMessage.Choice : Equatable {
}

extension OneOfMessage.Choice : Hashable {
}

extension OneOfMessage : Equatable {
}

extension OneOfMessage : Hashable {
}

extension OneOfMessage : Proto2Codable {
    public init(from reader: ProtoReader) throws {
        var choice: OneOfMessage.Choice? = nil

        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            case 1: choice = .foo(try reader.decode(Int32.self))
            case 3: choice = .bar(try reader.decode(String.self))
            case 4: choice = .baz(try reader.decode(String.self))
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

        self.choice = choice
    }

    public func encode(to writer: ProtoWriter) throws {
        if let choice = self.choice {
            try choice.encode(to: writer)
        }
        try writer.writeUnknownFields(unknownFields)
    }
}

extension OneOfMessage : Codable {
    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: OneOfMessage.CodingKeys.self)
        if (container.contains(.foo)) {
            let foo = try container.decode(Int32.self, forKey: .foo)
            self.choice = .foo(foo)
        } else if (container.contains(.bar)) {
            let bar = try container.decode(String.self, forKey: .bar)
            self.choice = .bar(bar)
        } else if (container.contains(.baz)) {
            let baz = try container.decode(String.self, forKey: .baz)
            self.choice = .baz(baz)
        } else {
            self.choice = nil
        }
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: OneOfMessage.CodingKeys.self)
        switch self.choice {
        case .foo(let foo): try container.encode(foo, forKey: .foo)
        case .bar(let bar): try container.encode(bar, forKey: .bar)
        case .baz(let baz): try container.encode(baz, forKey: .baz)
        case Optional.none: break
        }
    }

    public enum CodingKeys : String, CodingKey {

        case foo
        case bar
        case baz

    }
}
